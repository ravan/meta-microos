SUMMARY = "Class Library for Numbers (C++)"
DESCRIPTION = "CLN features a rich set of number classes: integer (unlimited \
precision), rational, short float, single float, double float, long \
float (unlimited precision), complex, modular integer, and univariate \
polynomial.  It implements elementary, logical, and transcendental \
functions.  C++ as the implementation language brings efficiency, type \
safety, and algebraic syntax.  Memory efficiency: small integers and \
short floats are immediate, not heap allocated. Automatic, \
noninterruptive garbage collection.  Speed efficiency: assembly \
language kernel for some CPUs, Karatsuba and Schoenhage-Strassen \
multiplication.  Interoperability: garbage collection with no burden on \
the main application, hooks for memory allocation and exceptions. \
 \
The following C++ features are used: classes, member functions, \
overloading of functions and operators, constructors and destructors, \
inline, const, multiple inheritance, templates, and namespaces.  The \
following C++ features are not used: new, delete, virtual inheritance, \
and exceptions."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.7"

RPM_NAME = "cln-devel-1.3.7-1.10.aarch64.rpm"
RPM_HASH = "ae3efae9dbe81567c192e3ff9deb12c59cb3f1c7a253107319780c6dc74db629ad5bccb9ed94eefab7c289702eb1c655443c2b5fc9aa458b0d5bfb2a5b31c240"

RPROVIDES:${PN} += "cln-devel \
pkgconfig-cln"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
cln"

inherit rpm
