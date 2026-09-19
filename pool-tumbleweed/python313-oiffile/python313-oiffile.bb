SUMMARY = "Read Olympus(r) image files (OIF and OIB)"
DESCRIPTION = "Oiffile is a Python library to read image and metadata from Olympus Image \
Format files. OIF is the native file format of the Olympus FluoView(tm) \
software for confocal microscopy."
LICENSE = "BSD-3-Clause"

PV = "2026.2.8"

RPM_NAME = "python313-oiffile-2026.2.8-2.2.noarch.rpm"
RPM_HASH = "27e33d78a1395a073e5418a67f56f42e745a30db3b12007de4392c425563d926e7e5c2ac5ff5cba840bd6cf6fac834808fed526c78e8f58d74c8d1ffbdff223b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-oiffile \
python3.13dist-oiffile \
python313-oiffile \
python3dist-oiffile"

RDEPENDS:${PN} += "python-abi \
python313-numpy \
python313-tifffile"

inherit rpm
