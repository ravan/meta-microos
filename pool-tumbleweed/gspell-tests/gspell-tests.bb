SUMMARY = "Installed tests for gspell"
DESCRIPTION = "Installed tests for gspell, compatible with gnome-desktop-testing-runner. \
Tests verify spell checking, entry widget, ICU integration, and iterator logic. \
Run with: gnome-desktop-testing-runner gspell-1"
LICENSE = "LGPL-2.1-or-later"

PV = "1.14.4"

RPM_NAME = "gspell-tests-1.14.4-2.1.aarch64.rpm"
RPM_HASH = "60c33ada7c4d90f6a0dc21c2fd170ec24edbcb8c55ad8da23935c2ecd40aac04feb7dcc6a8559403f074f4e57de2a866e927fd95be4daad02c120c09fc389669"

RPROVIDES:${PN} += "gspell-tests"

RDEPENDS:${PN} += "/usr/bin/sh \
aspell-en \
gnome-desktop-testing \
ld-linux-aarch64.so.1 \
libc.so.6 \
libenchant-2.so.2 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgspell-1-3 \
libgtk-3.so.0 \
libicuuc.so.78 \
libpango-1.0.so.0"

inherit rpm
