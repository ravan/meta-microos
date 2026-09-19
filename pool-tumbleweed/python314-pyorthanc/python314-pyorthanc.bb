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

RPM_NAME = "python314-pyorthanc-1.23.0-1.2.noarch.rpm"
RPM_HASH = "b713b9e239d7ad6e699f30c2e27daa80441159c9d24e0e401578c7272dc8f89be79f2d4a707d79ca0152ad06dc89d273169ca7219f59b4109478a31c189016e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyorthanc \
python314-pyorthanc \
python3dist-pyorthanc"

RDEPENDS:${PN} += "python-abi \
python314-httpx \
python314-pydicom"

inherit rpm
