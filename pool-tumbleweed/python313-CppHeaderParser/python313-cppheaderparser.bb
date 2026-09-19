SUMMARY = "Parse C++ header files and generate a data structure representing the class"
DESCRIPTION = "Parse C++ header files and generate a data structure representing \
the class"
LICENSE = "BSD-3-Clause"

PV = "2.7.4"

RPM_NAME = "python313-CppHeaderParser-2.7.4-1.5.noarch.rpm"
RPM_HASH = "5eb20d009129e579348d978716c2091386518f7a46c50dc529b9d6e9fd7554004ee65b2ee237e7b9e8486a674b6d130bd004a75cd09f22d346a7a4423d0539fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-CppHeaderParser \
python3.13dist-cppheaderparser \
python313-CppHeaderParser \
python3dist-cppheaderparser"

RDEPENDS:${PN} += "python-abi \
python313-ply"

inherit rpm
