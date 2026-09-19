SUMMARY = "Implementation of a 'Singleton' class"
DESCRIPTION = "This is the 'Class::Singleton' module. A Singleton describes an object \
class that can have only one instance in any system. An example of a \
Singleton might be a print spooler or system registry. This module \
implements a Singleton class from which other classes can be derived. By \
itself, the 'Class::Singleton' module does very little other than manage \
the instantiation of a single object. In deriving a class from \
'Class::Singleton', your module will inherit the Singleton instantiation \
method and can implement whatever specific functionality is required. \
 \
For a description and discussion of the Singleton class, see 'Design \
Patterns', Gamma et al, Addison-Wesley, 1995, ISBN 0-201-63361-2."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.600.0"

RPM_NAME = "perl-Class-Singleton-1.600.0-1.10.noarch.rpm"
RPM_HASH = "793ed6c65edf78470178880dafcda0bd3a0e97c503a80dd43361226dc7b1265660f986d0f075f618681d978589b74b90edd5c7eec8be7a519b1eaec8bda65cc4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Class--Singleton \
perl-Class-Singleton"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
