SUMMARY = "Microsoft Azure Service Management Legacy Client Library"
DESCRIPTION = "This is the Microsoft Azure Service Management Legacy Client Library. \
 \
All packages in this bundle have been tested with Python 2.7, 3.3, 3.4 and 3.5."
LICENSE = "Apache-2.0"

PV = "0.20.8"

RPM_NAME = "python314-azure-servicemanagement-legacy-0.20.8-1.9.noarch.rpm"
RPM_HASH = "9b20a6ce63414017478b8dc15d321fdf0ea2f77c8ed39fc083c228e6ed9cf83f63ee6eef43b357ee862e0f16ef341d63130fe18ae15b10f7fb4f3ac6d009f695"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-servicemanagement-legacy \
python314-azure-servicemanagement-legacy \
python3dist-azure-servicemanagement-legacy"

RDEPENDS:${PN} += "python-abi \
python314-azure-common \
python314-azure-nspkg \
python314-requests"

inherit rpm
