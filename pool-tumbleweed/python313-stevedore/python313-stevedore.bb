SUMMARY = "Manage dynamic plugins for Python applications"
DESCRIPTION = "Python makes loading code dynamically easy, allowing you to configure \
and extend your application by discovering and loading extensions \
(plugins) at runtime. Many applications implement their own \
library for doing this, using ``__import__`` or ``importlib``. \
stevedore avoids creating yet another extension \
mechanism by building on top of setuptools entry points. The code \
for managing entry points tends to be repetitive, though, so stevedore \
provides manager classes for implementing common patterns for using \
dynamically loaded extensions."
LICENSE = "Apache-2.0"

PV = "5.9.1"

RPM_NAME = "python313-stevedore-5.9.1-1.1.noarch.rpm"
RPM_HASH = "5193ee37f519a5605f6fd6655c9b1caf23756934b9b04df286b57ac5a7b121d0287f93f67ea2fa5b7eb26a0d85b289f2c0a99ce2128a679c7b013a5f980cebbe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-stevedore \
python3.13dist-stevedore \
python313-stevedore \
python3dist-stevedore"

RDEPENDS:${PN} += "python-abi \
python313-pbr"

inherit rpm
