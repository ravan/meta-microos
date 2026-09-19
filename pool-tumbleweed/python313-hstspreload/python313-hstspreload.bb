SUMMARY = "Python Chromium HSTS Preload list"
DESCRIPTION = "Chromium HSTS Preload list as a Python package."
LICENSE = "BSD-3-Clause"

PV = "2026.8.1"

RPM_NAME = "python313-hstspreload-2026.8.1-1.1.noarch.rpm"
RPM_HASH = "c77b27f2d564f561a4ce0829680d04f3c7bf9daed4b3f907d052e6b74fdd3d4ee7b6caa44e98aeb83ac1ae5cdd873cd57f6fa77b64f80a0f81a360b2f9947c3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-hstspreload \
python3.13dist-hstspreload \
python313-hstspreload \
python3dist-hstspreload"

RDEPENDS:${PN} += "python-abi"

inherit rpm
