package com.xiaopo.flying.sticker;

import androidx.annotation.NonNull;

@FunctionalInterface
public interface OnStickerAddedCallback {
  void onStickerAdded(@NonNull Sticker sticker);
}
