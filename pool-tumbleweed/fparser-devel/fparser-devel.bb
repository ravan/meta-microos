SUMMARY = "Development files for libfparser"
DESCRIPTION = "This C++ library offers a class which can be used to parse and \
evaluate a mathematical function from a string (which might be e.g. \
requested from the user). The syntax of the function string is \
similar to mathematical expressions written in C/C++ (the exact \
syntax is specified later in this document). The function can then be \
evaluated with different values of variables. \
 \
For example, a function like 'sin(sqrt(x*x+y*y))' can be parsed from \
a string (either std::string or a C-style string) and then evaluated \
with different values of x and y. This library can be useful for \
evaluating user-inputted functions, or in some cases interpreting \
mathematical expressions in a scripting language."
LICENSE = "LGPL-3.0"

PV = "4.5.2"

RPM_NAME = "fparser-devel-4.5.2-1.42.aarch64.rpm"
RPM_HASH = "f60962ca4826609946e25fd3772886ebc216526a4f07612610ea92f6d63ce3fd710158c52ec5ef844a6ad51bd7f958df1e70ef9c5f9dbfaa649ae5e63a8b9099"

RPROVIDES:${PN} += "fparser-devel \
pkgconfig-fparser"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfparser-4-5-2"

inherit rpm
