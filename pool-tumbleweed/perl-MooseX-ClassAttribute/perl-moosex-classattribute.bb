SUMMARY = "Declare class attributes Moose-style"
DESCRIPTION = "This module allows you to declare class attributes in exactly the same way \
as object attributes, using 'class_has()' instead of 'has()'. \
 \
You can use any feature of Moose's attribute declarations, including \
overriding a parent's attributes, delegation ('handles'), attribute traits, \
etc. All features should just work. The one exception is the 'required' \
flag, which is not allowed for class attributes. \
 \
The accessor methods for class attribute may be called on the class \
directly, or on objects of that class. Passing a class attribute to the \
constructor will not set that attribute."
LICENSE = "Artistic-2.0"

PV = "0.29"

RPM_NAME = "perl-MooseX-ClassAttribute-0.29-1.38.noarch.rpm"
RPM_HASH = "944074f785a02b040da5b8495dc1fa2b5196d924c0448719b0951a585d5c06c7416ad11cebfada439866006590af710ccc12fe593f4483fc2819797473f38d5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--ClassAttribute \
perl-MooseX--ClassAttribute--Meta--Role--Attribute \
perl-MooseX--ClassAttribute--Trait--Application \
perl-MooseX--ClassAttribute--Trait--Application--ToClass \
perl-MooseX--ClassAttribute--Trait--Application--ToRole \
perl-MooseX--ClassAttribute--Trait--Attribute \
perl-MooseX--ClassAttribute--Trait--Class \
perl-MooseX--ClassAttribute--Trait--Mixin--HasClassAttributes \
perl-MooseX--ClassAttribute--Trait--Role \
perl-MooseX--ClassAttribute--Trait--Role--Composite \
perl-MooseX-ClassAttribute"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-List--Util \
perl-Moose \
perl-Moose--Exporter \
perl-Moose--Meta--Role--Attribute \
perl-Moose--Role \
perl-Moose--Util \
perl-Moose--Util--MetaRole \
perl-namespace--autoclean \
perl-namespace--clean"

inherit rpm
