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

RPM_NAME = "python313-lazy-imports-1.2.0-1.3.noarch.rpm"
RPM_HASH = "7817a6c75ff2b85a82deda772f1b229f2e52e39e051c6ca7bb61275556c44bff95bea963d8404c0fadb06f7709b53af35a3383851d2adb81f432fe6749d117d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-lazy-imports \
python3.13dist-lazy-imports \
python313-lazy-imports \
python3dist-lazy-imports"

RDEPENDS:${PN} += "python-abi"

inherit rpm
