SUMMARY = "Tool to support lazy imports"
DESCRIPTION = "This python utility package helps to create *lazy modules*. \
A lazy module defers loading (some of) its attributes until these attributes are first accessed. \
The module's lazy attributes in turn are attributes of other modules. \
These other modules will be imported/loaded only when (and if) associated attributes are used. \
A lazy import strategy can drastically reduce runtime and memory consumption. \
 \
Additionally, this package provides a utility for *optional imports* with which one can import a module globally while triggering associated import errors only at use-sites (when and if a dependency is actually required, for example in the context of a specific functionality)."
LICENSE = "Apache-2.0"

PV = "1.2.0"

RPM_NAME = "python314-lazy-imports-1.2.0-1.3.noarch.rpm"
RPM_HASH = "d5e41b2fc20387012887e3d6744da19f862fa376f29730aba6cc94f4dfb2705e4f4000454863a476a0b5dfbce53e4717081cf18d9fce69304b0dc8611277e436"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-lazy-imports \
python314-lazy-imports \
python3dist-lazy-imports"

RDEPENDS:${PN} += "python-abi"

inherit rpm
