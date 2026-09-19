SUMMARY = "Qt 5 NetworkAuth Library"
DESCRIPTION = "Qt Network Authorization provides a set of APIs that enable Qt \
applications to obtain limited access to online accounts and HTTP \
services without exposing users' passwords. It supports OAuth \
versions 1 and 2."
LICENSE = "GPL-3.0-or-later"

PV = "5.15.19+kde0"

RPM_NAME = "libQt5NetworkAuth5-5.15.19+kde0-1.3.aarch64.rpm"
RPM_HASH = "36496fc6854441130db6d3566cf387e46dc2f939c42d97a1bf4e269dc1fd7e26e898fc6c8548f233034a05cb714301c38d450dac7b36fa255e6bfdddb434e299"

RPROVIDES:${PN} += "libQt5NetworkAuth.so.5 \
libQt5NetworkAuth5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Core5 \
libQt5Network.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
