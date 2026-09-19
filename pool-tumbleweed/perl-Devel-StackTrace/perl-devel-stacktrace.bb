SUMMARY = "An object representing a stack trace"
DESCRIPTION = "The 'Devel::StackTrace' module contains two classes, 'Devel::StackTrace' \
and Devel::StackTrace::Frame. These objects encapsulate the information \
that can retrieved via Perl's 'caller' function, as well as providing a \
simple interface to this data. \
 \
The 'Devel::StackTrace' object contains a set of 'Devel::StackTrace::Frame' \
objects, one for each level of the stack. The frames contain all the data \
available from 'caller'. \
 \
This code was created to support my Exception::Class::Base class (part of \
Exception::Class) but may be useful in other contexts."
LICENSE = "Artistic-2.0"

PV = "2.50.0"

RPM_NAME = "perl-Devel-StackTrace-2.50.0-2.12.noarch.rpm"
RPM_HASH = "adb3d6fb61d4330c5d58e1cbffe4ae55dac5db2fe9f0bd7e690e9e8923b6fef02bbf0dc8768b8909920268a193e26c510bf2c765f99333f273ba40c9f51d8fc5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Devel--StackTrace \
perl-Devel--StackTrace--Frame \
perl-Devel-StackTrace"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
