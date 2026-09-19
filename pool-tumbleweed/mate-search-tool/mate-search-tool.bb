SUMMARY = "MATE Search Tool"
DESCRIPTION = "This is the MATE Seach Tool as shipped with the MATE utilities. It uses \
command-line tools such as find and locate to get results."
LICENSE = "GPL-2.0-or-later"

PV = "1.28.0"

RPM_NAME = "mate-search-tool-1.28.0-2.6.aarch64.rpm"
RPM_HASH = "d8d5cfbc2d8e2addf3a3dd87fbcad4fd14444ec9850e9e3f30d13ad681ea958a9d135fa46192b1eab4ce33372b6a20cec7170473f27af4acd87a2e8ae44cf1d8"

RPROVIDES:${PN} += "mate-search-tool"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libICE.so.6 \
libSM.so.6 \
libatk-1.0.so.0 \
libc.so.6 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
mate-desktop-gschemas"

inherit rpm
