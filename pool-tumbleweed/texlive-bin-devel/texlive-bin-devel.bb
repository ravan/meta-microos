SUMMARY = "Basic development packages for TeXLive"
DESCRIPTION = "This package will cause the installation of several \
development packages for TeXLive."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & SUSE-TeX"

PV = "2026.20260301"

RPM_NAME = "texlive-bin-devel-2026.20260301-120.4.aarch64.rpm"
RPM_HASH = "e2bf58665a520fe795110eee6a57b749d1794df3b5b294a0264337442380330ab5f363854d7896a7d665c07ac2fc8bb2e3dd8e300a36b5ba6d17009b90343d73"

RPROVIDES:${PN} += "texlive-bin-devel"

RDEPENDS:${PN} += "libkpathsea6 \
libptexenc1 \
libsynctex2 \
libtexlua53-5 \
libtexluajit2 \
texlive-cweb-bin \
texlive-web-bin"

inherit rpm
