SUMMARY = "Make class syntax available"
DESCRIPTION = "This module provides the new 'class' keyword and related others ('method', \
'field' and 'ADJUST') in a forward-compatible way. \
 \
Perl added such syntax at version 5.38.0, which is enabled by \
 \
   use feature 'class'; \
 \
This syntax was further expanded in 5.40, adding the '__CLASS__' keyword \
and ':reader' attribute on fields, and again in 5.42 to add the ':writer' \
attribute. \
 \
On that version of perl or later, this module simply enables the core \
feature equivalent of using it directly. On such perls, this module will \
install with no non-core dependencies, and requires no C compiler. \
 \
On older versions of perl before such syntax is availble in core, it is \
currently provided instead using the Object::Pad module, imported with a \
special set of options to configure it to only recognise the same syntax as \
the core perl feature, thus ensuring any code using it will still continue \
to function on that newer perl. \
 \
This module is a work-in-progress, because the underlying 'feature 'class'' \
is too. Many of the limitations and inabilities listed below are a result \
of the early-access nature of this branch, and are expected to be lifted as \
work progresses towards a more featureful and complete implementation."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.80.0"

RPM_NAME = "perl-Feature-Compat-Class-0.80.0-1.1.noarch.rpm"
RPM_HASH = "af8d2e244aca5bb7e697ce6e19d1ea7bc9f48ef49230698ec231f2a880170d8be49e42be7d059d3f59b41a6810004a71a24f7b4b4a73a04d403aacff8ce4e2b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Feature--Compat--Class \
perl-Feature-Compat-Class"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Object--Pad"

inherit rpm
