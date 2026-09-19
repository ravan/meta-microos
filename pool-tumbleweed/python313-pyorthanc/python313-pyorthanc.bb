SUMMARY = "A comprehensive Python client for Orthanc"
DESCRIPTION = "PyOrthanc is a comprehensive Python client for Orthanc, providing: \
 \
- Complete wrapping of the Orthanc REST API methods \
- High-level utilities for common DICOM operations \
- Asynchronous client support \
- Helper functions for working with DICOM data \
- Integration with the Orthanc Python plugin"
LICENSE = "MIT"

PV = "1.23.0"

RPM_NAME = "python313-pyorthanc-1.23.0-1.2.noarch.rpm"
RPM_HASH = "454a05bce81b8c1028a9cb610e12254e20b20d48fd789a9a13fec16f929971aacc8d79113ccb999884b9040812ab60bea4a98c338241ceffcd36b2d8d19997c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyorthanc \
python3.13dist-pyorthanc \
python313-pyorthanc \
python3dist-pyorthanc"

RDEPENDS:${PN} += "python-abi \
python313-httpx \
python313-pydicom"

inherit rpm
