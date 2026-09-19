SUMMARY = "Python module to build tested documentation"
DESCRIPTION = "Manuel lets the user build tested documentation. \
 \
Documentation, a full list of included plug-ins, and examples are available \
with the -doc package and at http://packages.python.org/manuel/."
LICENSE = "Apache-2.0"

PV = "1.13.0"

RPM_NAME = "python313-manuel-doc-1.13.0-2.5.noarch.rpm"
RPM_HASH = "fa878bfbc5699567688361bd630d0b82b1c72f011d905b72c7ac117a9c439f965c40f6d71bcfa72cbfabd2d0cce34beb14603965863876e3336a515b1d75ab71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-manuel-doc \
python313-manuel-doc"

RDEPENDS:${PN} += ""

inherit rpm
