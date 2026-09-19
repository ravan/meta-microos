SUMMARY = "Minimalist Object Orientation (with Moose compatibility)"
DESCRIPTION = "'Moo' is an extremely light-weight Object Orientation system. It allows one \
to concisely define objects and roles with a convenient syntax that avoids \
the details of Perl's object system. 'Moo' contains a subset of Moose and \
is optimised for rapid startup. \
 \
'Moo' avoids depending on any XS modules to allow for simple deployments. \
The name 'Moo' is based on the idea that it provides almost -- but not \
quite -- two thirds of Moose. As such, the Moose::Manual can serve as an \
effective guide to 'Moo' aside from the MOP and Types sections. \
 \
Unlike Mouse this module does not aim at full compatibility with Moose's \
surface syntax, preferring instead to provide full interoperability via the \
metaclass inflation capabilities described in MOO AND MOOSE. \
 \
For a full list of the minor differences between Moose and Moo's surface \
syntax, see INCOMPATIBILITIES WITH MOOSE."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.005005"

RPM_NAME = "perl-Moo-2.005005-1.17.noarch.rpm"
RPM_HASH = "178cd036a319ed92c05e8092aea4d5ea6111e01cfc0d1ba9b33b47a09d5fd24dde8bd597f901299a8c15567ed6513c6ffa2da76eff3682ef881828c010d60bfc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Method--Generate--Accessor \
perl-Method--Generate--BuildAll \
perl-Method--Generate--Constructor \
perl-Method--Generate--DemolishAll \
perl-Moo \
perl-Moo---Utils \
perl-Moo--HandleMoose \
perl-Moo--HandleMoose---TypeMap \
perl-Moo--HandleMoose--FakeConstructor \
perl-Moo--HandleMoose--FakeMetaClass \
perl-Moo--Object \
perl-Moo--Role \
perl-Moo--sification \
perl-oo"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Class--Method--Modifiers \
perl-Role--Tiny \
perl-Sub--Defer \
perl-Sub--Quote"

inherit rpm
