SUMMARY = "Command-line tool to sign files and verify signatures"
DESCRIPTION = "Rust implementation of Minisign, a tool to sign files and verify signatures."
LICENSE = "MIT"

PV = "0.6.3+0"

RPM_NAME = "rsign2-0.6.3+0-1.14.aarch64.rpm"
RPM_HASH = "76db059e3496eb00e9c0b5c1f2cfbb46f67df8b820d070f411588195e6a5b2861884ae89c3627294aa3926ca26fcc9c87ba9a06aa6ad42fa2c544a50a7281768"

RPROVIDES:${PN} += "rsign \
rsign2"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1"

inherit rpm
