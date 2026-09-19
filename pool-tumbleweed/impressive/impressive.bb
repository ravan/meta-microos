SUMMARY = "PDF and image viewer optimized for presentations"
DESCRIPTION = "Impressive is a program that displays presentation slides. \
Features: \
- Page transitions \
- Overview screen \
- Highlight boxes \
- Spotlight effect"
LICENSE = "GPL-2.0-only"

PV = "0.13.2"

RPM_NAME = "impressive-0.13.2-1.9.noarch.rpm"
RPM_HASH = "8c57d628e0cb4f5fa060ce70a7c897a67c3979db9efa9faed9108f15765cb73faa8ce90561627134a9c0065a55dd770326e0b0026d6212b9230a1faacacbe72f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "impressive"

RDEPENDS:${PN} += "/usr/bin/python3 \
ghostscript \
python3-imaging \
python3-opengl \
python3-pygame"

inherit rpm
