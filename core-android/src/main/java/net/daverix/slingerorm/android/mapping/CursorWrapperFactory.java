package net.daverix.slingerorm.android.mapping;
import android.database.Cursor;

import net.daverix.slingerorm.mapping.IFetchableValues;

public class CursorWrapperFactory implements ICursorWrapperFactory {

    public CursorWrapperFactory() {
    }

    @Override
    public IFetchableValues create(Cursor cursor) {
        if(cursor == null) throw new IllegalArgumentException("cursor is null");

        return new CursorWrapper(cursor);
    }
}