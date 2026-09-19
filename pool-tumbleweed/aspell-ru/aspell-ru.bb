SUMMARY = "Russian (русский) Dictionary for Aspell"
DESCRIPTION = "A Russian  (русский) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & SUSE-Permissive-Modify-By-Patch"

PV = "0.99.f7.1"

RPM_NAME = "aspell-ru-0.99.f7.1-4.7.aarch64.rpm"
RPM_HASH = "a83776370910b8e32130bafbf5795fdab1bbf3b40f9ce5e668d959424f6724d7ec5fa323e1ca4b923848f9beb38314bc05351654f5e093e092081442d4cdebbf"

RPROVIDES:${PN} += "aspell-ru \
locale-aspell-ru"

RDEPENDS:${PN} += ""

inherit rpm
