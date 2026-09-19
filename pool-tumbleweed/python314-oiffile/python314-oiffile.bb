SUMMARY = "Read Olympus(r) image files (OIF and OIB)"
DESCRIPTION = "Oiffile is a Python library to read image and metadata from Olympus Image \
Format files. OIF is the native file format of the Olympus FluoView(tm) \
software for confocal microscopy."
LICENSE = "BSD-3-Clause"

PV = "2026.2.8"

RPM_NAME = "python314-oiffile-2026.2.8-2.2.noarch.rpm"
RPM_HASH = "63c7cf1b326a3b7e8b39fae510e53c5549fb800a7ce8f1f6aeb369490eb89f0351694aa18a1d17187e3884a78cb1d219538c8b743cca03b3ff6e7d194eac2784"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-oiffile \
python314-oiffile \
python3dist-oiffile"

RDEPENDS:${PN} += "python-abi \
python314-numpy \
python314-tifffile"

inherit rpm
