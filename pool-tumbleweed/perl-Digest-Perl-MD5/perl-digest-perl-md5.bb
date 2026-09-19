SUMMARY = "Perl Implementation of Rivest's MD5 algorithm"
DESCRIPTION = "This module has the same interface as the much faster 'Digest::MD5'. So you \
can easily exchange them, e.g. \
 \
	BEGIN { \
	  eval { \
	    require Digest::MD5; \
	    import Digest::MD5 'md5_hex' \
	  }; \
	  if ($@) { # oops, no Digest::MD5 \
	    require Digest::Perl::MD5; \
	    import Digest::Perl::MD5 'md5_hex' \
	  } \
	} \
 \
If the 'Digest::MD5' module is available it is used and if not you take \
'Digest::Perl::MD5'. \
 \
You can also install the Perl part of Digest::MD5 together with \
Digest::Perl::MD5 and use Digest::MD5 as normal, it falls back to \
Digest::Perl::MD5 if it cannot load its object files. \
 \
For detailed documentation see the 'Digest::MD5' module."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.910.0"

RPM_NAME = "perl-Digest-Perl-MD5-1.910.0-1.4.noarch.rpm"
RPM_HASH = "e8e15c991fd1a56994f4b3e1ce87c5ca2f837c25964b826a2bd673ad8c0232ba8b309cbd349588d6dff28624f1ac3967050dee02284b3ac76ff4f4940728e5e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Digest--Perl--MD5 \
perl-Digest-Perl-MD5"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
