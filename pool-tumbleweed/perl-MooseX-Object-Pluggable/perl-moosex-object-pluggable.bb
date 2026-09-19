SUMMARY = "Make your classes pluggable"
DESCRIPTION = "This module is meant to be loaded as a role from Moose-based classes. It \
will add five methods and four attributes to assist you with the loading \
and handling of plugins and extensions for plugins. I understand that this \
may pollute your namespace, however I took great care in using the least \
ambiguous names possible."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.0014"

RPM_NAME = "perl-MooseX-Object-Pluggable-0.0014-1.40.noarch.rpm"
RPM_HASH = "769c38feee9eda63e88f0b7da342b2f966a243ea11e63032a3ee1d48cc3aee8967264ac17e4eb1b9cc0d12db4dc5acc60afcf2332c4f56ab1ebe842f2bd2fd6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--Object--Pluggable \
perl-MooseX-Object-Pluggable"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Module--Pluggable--Object \
perl-Module--Runtime \
perl-Moose--Role \
perl-Moose--Util \
perl-Try--Tiny \
perl-namespace--autoclean"

inherit rpm
