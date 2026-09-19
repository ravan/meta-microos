SUMMARY = "Binary files of petri-nets"
DESCRIPTION = "Binary files of petri-nets"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn39165"

RPM_NAME = "texlive-petri-nets-bin-2026.20260301.svn39165-120.4.aarch64.rpm"
RPM_HASH = "0e78934479838f9352c8f79ca9ca04dbafd5531263dc179729e61ccc7b218527f9112205253e0ae612d07dcc2299f6158e9d2eb5fe8c833593882ec47580fa94"

RPROVIDES:${PN} += "texlive-petri-nets-bin"

RDEPENDS:${PN} += "texlive-petri-nets"

inherit rpm
