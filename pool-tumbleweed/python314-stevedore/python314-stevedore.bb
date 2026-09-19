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

RPM_NAME = "python314-stevedore-5.9.1-1.1.noarch.rpm"
RPM_HASH = "7b3582416777e8d6ca92b808895196e4a0e325b947cbccaa39944a9fbc05e1ca830bea71083cb87bc0e9fa65fc7446221469984435774e4eaafde944fb746eb6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-stevedore \
python314-stevedore \
python3dist-stevedore"

RDEPENDS:${PN} += "python-abi \
python314-pbr"

inherit rpm
