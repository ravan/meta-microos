SUMMARY = "Template Toolkit reimplemented in as little code as possible"
DESCRIPTION = "*Template::Tiny* is a reimplementation of a subset of the functionality \
from Template Toolkit in as few lines of code as possible. \
 \
It is intended for use in light-usage, low-memory, or low-cpu templating \
situations, where you may need to upgrade to the full feature set in the \
future, or if you want the retain the familiarity of TT-style templates. \
 \
For the subset of functionality it implements, it has fully-compatible \
template and stash API. All templates used with *Template::Tiny* should be \
able to be transparently upgraded to full Template Toolkit. \
 \
Unlike Template Toolkit, *Template::Tiny* will process templates without a \
compile phase (but despite this is still quicker, owing to heavy use of the \
Perl regular expression engine."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.160.0"

RPM_NAME = "perl-Template-Tiny-1.160.0-1.7.noarch.rpm"
RPM_HASH = "06f79e42430accc5127ea690641714a157fa5731a280ebe9f4b414e349d4334d1927a5e368e59c3abea61902dd02095b4a92b9dce159492380e5d4c67a9c60d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Template--Tiny \
perl-Template-Tiny"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
