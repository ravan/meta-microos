SUMMARY = "Simon’s Improved Layout Engine"
DESCRIPTION = "SILE is a typesetting system; its job is to produce beautiful printed documents. \
Conceptually, SILE is similar to TeX—from which it borrows some concepts and even \
syntax and algorithms—but the similarities end there. Rather than being a \
derivative of the TeX family SILE is a new typesetting and layout engine written \
from the ground up using modern technologies and borrowing some ideas from \
graphical systems such as InDesign."
LICENSE = "MIT"

PV = "0.15.13"

RPM_NAME = "sile-0.15.13-2.7.aarch64.rpm"
RPM_HASH = "e07f7eb4fa19c3b874acecb40ed6c3bc938caa314ef8802f79b684b79020caaf7d335ef485e557357078c9710b91f5c4f9bbfd9660a001a57031c1038e78a905"

RPROVIDES:${PN} += "sile"

RDEPENDS:${PN} += "fontconfig \
freetype2 \
git-core \
glibc \
icu \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfontconfig.so.1 \
libgcc-s.so.1 \
libharfbuzz-subset.so.0 \
libharfbuzz.so.0 \
libicui18n.so.78 \
libicuuc.so.78 \
libluajit-5.1.so.2 \
libm.so.6 \
libtexpdf.so.0 \
luajit-bit32 \
luajit-cassowary \
luajit-cldr \
luajit-cliargs \
luajit-compat-5.3 \
luajit-cosmo \
luajit-fluent \
luajit-linenoise \
luajit-loadkit \
luajit-lpeg \
luajit-luaepnf \
luajit-luaexpat \
luajit-luafilesystem \
luajit-luarepl \
luajit-luasec \
luajit-luasocket \
luajit-luautf8 \
luajit-penlight \
luajit-vstruct \
luajit-zlib"

inherit rpm
