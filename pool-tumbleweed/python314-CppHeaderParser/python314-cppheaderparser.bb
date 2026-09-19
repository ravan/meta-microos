SUMMARY = "Parse C++ header files and generate a data structure representing the class"
DESCRIPTION = "Parse C++ header files and generate a data structure representing \
the class"
LICENSE = "BSD-3-Clause"

PV = "2.7.4"

RPM_NAME = "python314-CppHeaderParser-2.7.4-1.5.noarch.rpm"
RPM_HASH = "aa4d765ec9856a8e5f5af40929f6352f809f445b1800ea0f684f7326e250f82c0dbd2cb63b64f1e119dd20552270e04e8ed18635797cefe8d7f5c6ebbb5fae72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-cppheaderparser \
python314-CppHeaderParser \
python3dist-cppheaderparser"

RDEPENDS:${PN} += "python-abi \
python314-ply"

inherit rpm
