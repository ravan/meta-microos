SUMMARY = "Get the currently executing AST node of a frame, and other information"
DESCRIPTION = "Get the currently executing AST node of a frame, and other information"
LICENSE = "MIT"

PV = "2.2.1"

RPM_NAME = "python313-executing-2.2.1-3.2.noarch.rpm"
RPM_HASH = "dc2ddab924de796fed2b3d550898b83a88744b78c3095b7c8b101fe0713e2fbdf565e49d5c378889fe6db7c69cb52b8f8cf8519b6d428c389ee151fdd4fed793"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-executing \
python3.13dist-executing \
python313-executing \
python3dist-executing"

RDEPENDS:${PN} += "python-abi"

inherit rpm
