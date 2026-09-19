SUMMARY = "Python @deprecated decorator"
DESCRIPTION = "If you need to mark a function or a method as deprecated, \
you can use the ``@deprecated`` decorator."
LICENSE = "MIT"

PV = "1.3.1"

RPM_NAME = "python313-Deprecated-1.3.1-1.4.noarch.rpm"
RPM_HASH = "513ccdf3da40c14647aa60f2a197d76f7c66ad40d6a2503a205bc2b1c918daf5b8cb0a571975818c6d672a1aa9af8b0c05fdfb25c96984bd26c67c8e9a0d033a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Deprecated \
python3-deprecated \
python3.13dist-deprecated \
python313-Deprecated \
python313-deprecated \
python3dist-deprecated"

RDEPENDS:${PN} += "python-abi \
python313-wrapt"

inherit rpm
