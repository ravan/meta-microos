SUMMARY = "Pinyin and Table IM support for fcitx5"
DESCRIPTION = "This provides pinyin and table input method support for fcitx5."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "5.1.11"

RPM_NAME = "fcitx5-chinese-addons-5.1.11-1.4.aarch64.rpm"
RPM_HASH = "5fdffbcf6270892b7c0e1a6b1db66c9cd312d41bc08bba59dab7f4c19320366c0377f284f9c27acc72919c7449c42dbb09c8c8e79985d91eae9721dbe3303998"

RPROVIDES:${PN} += "fcitx-cloudpinyin \
fcitx-googlepinyin \
fcitx-libpinyin \
fcitx-pinyin \
fcitx-sunpinyin \
fcitx-table \
fcitx-table-cn-bingchan \
fcitx-table-cn-cangjie \
fcitx-table-cn-dianbao \
fcitx-table-cn-erbi \
fcitx-table-cn-wanfeng \
fcitx-table-cn-wubi \
fcitx-table-cn-wubi-pinyin \
fcitx-table-cn-ziran \
fcitx5-chinese-addons \
libchttrans.so \
libcloudpinyin.so \
libfullwidth.so \
libpinyin.so \
libpinyinhelper.so \
libpunctuation.so \
libtable.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libFcitx5Config.so.6 \
libFcitx5Core.so.7 \
libFcitx5Utils.so.2 \
libIMECore.so.0 \
libIMEPinyin.so.0 \
libIMETable.so.0 \
libc.so.6 \
libcurl.so.4 \
libgcc-s.so.1 \
libm.so.6 \
libopencc.so.1.2 \
libstdc++.so.6"

inherit rpm
