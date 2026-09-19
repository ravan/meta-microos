SUMMARY = "Easy MIME message handling"
DESCRIPTION = "This is an extension of the Email::Simple module, to handle MIME encoded \
messages. It takes a message as a string, splits it up into its constituent \
parts, and allows you access to various parts of the message. Headers are \
decoded from MIME encoding."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.954.0"

RPM_NAME = "perl-Email-MIME-1.954.0-1.12.noarch.rpm"
RPM_HASH = "25059439a9aa0cabb721fe25e7f2503edc09f910694b4e940ea8d7be396a8612a36d817ac3eef9756d4dc02df0b1dbc3ba6d083579a823b574fa7e64752161a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Email--MIME \
perl-Email--MIME--Creator \
perl-Email--MIME--Encode \
perl-Email--MIME--Header \
perl-Email--MIME--Header--AddressList \
perl-Email--MIME--Modifier \
perl-Email-MIME"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Email--Address--XS \
perl-Email--MIME--ContentType \
perl-Email--MIME--Encodings \
perl-Email--MessageID \
perl-Email--Simple \
perl-Email--Simple--Creator \
perl-Email--Simple--Header \
perl-MIME--Types \
perl-Module--Runtime \
perl-parent"

inherit rpm
