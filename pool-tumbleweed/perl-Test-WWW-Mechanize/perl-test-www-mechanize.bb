SUMMARY = "Testing-specific WWW::Mechanize subclass"
DESCRIPTION = "Testing-specific WWW::Mechanize subclass"
LICENSE = "Artistic-2.0"

PV = "1.60"

RPM_NAME = "perl-Test-WWW-Mechanize-1.60-1.18.noarch.rpm"
RPM_HASH = "c2c10a8caea7e0c7f45cfad6948810759debcc2626bcf4987be9d0c80ccacf19044cd340bc8b253e10f58233f928ca6aea39bb9304e223a3ae6cbc501de74374"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--WWW--Mechanize \
perl-Test-WWW-Mechanize"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Carp--Assert--More \
perl-HTML--Form \
perl-HTML--TokeParser \
perl-HTTP--Message \
perl-LWP \
perl-Test--LongString \
perl-WWW--Mechanize \
perl-parent"

inherit rpm
