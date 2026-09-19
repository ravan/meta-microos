SUMMARY = "Class that represents an HTML form element"
DESCRIPTION = "Objects of the 'HTML::Form' class represents a single HTML '<form> ... \
</form>' instance. A form consists of a sequence of inputs that usually \
have names, and which can take on various values. The state of a form can \
be tweaked and it can then be asked to provide HTTP::Request objects that \
can be passed to the request() method of LWP::UserAgent."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "6.130.0"

RPM_NAME = "perl-HTML-Form-6.130.0-1.5.noarch.rpm"
RPM_HASH = "9856e2fa877fd8a10ac014ea10792421a6b6241d3e13b6740b620a14c005fdfc290950ec6297235fb8e5c5e5fc8875a0ebd5ec8d72f7a001101aa863924ef7ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-HTML--Form \
perl-HTML--Form--FileInput \
perl-HTML--Form--IgnoreInput \
perl-HTML--Form--ImageInput \
perl-HTML--Form--Input \
perl-HTML--Form--KeygenInput \
perl-HTML--Form--ListInput \
perl-HTML--Form--SubmitInput \
perl-HTML--Form--TextInput \
perl-HTML-Form"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-HTML--TokeParser \
perl-HTTP--Request \
perl-HTTP--Request--Common \
perl-Test--More \
perl-URI \
perl-parent"

inherit rpm
