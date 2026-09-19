SUMMARY = "Unified interface to mail representations"
DESCRIPTION = "'Email::Abstract' provides module writers with the ability to write simple, \
representation-independent mail handling code. For instance, in the cases \
of 'Mail::Thread' or 'Mail::ListDetector', a key part of the code involves \
reading the headers from a mail object. Where previously one would either \
have to specify the mail class required, or to build a new object from \
scratch, 'Email::Abstract' can be used to perform certain simple operations \
on an object regardless of its underlying representation. \
 \
'Email::Abstract' currently supports 'Mail::Internet', 'MIME::Entity', \
'Mail::Message', 'Email::Simple', 'Email::MIME', and 'Courriel'. Other \
representations are encouraged to create their own 'Email::Abstract::*' \
class by copying 'Email::Abstract::EmailSimple'. All modules installed \
under the 'Email::Abstract' hierarchy will be automatically picked up and \
used."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "3.10.0"

RPM_NAME = "perl-Email-Abstract-3.10.0-2.12.noarch.rpm"
RPM_HASH = "0f3c59f5995243969f474f0d39123337f36d820ec3f6c1ea4c7e60da5dc203c9d6ededdc57d75492b89bca4e1f896ebd359d4c3bf75e505f2170c3e3972b5119"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Email--Abstract \
perl-Email--Abstract--EmailMIME \
perl-Email--Abstract--EmailSimple \
perl-Email--Abstract--MIMEEntity \
perl-Email--Abstract--MailInternet \
perl-Email--Abstract--MailMessage \
perl-Email--Abstract--Plugin \
perl-Email-Abstract"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Email--Simple \
perl-MRO--Compat \
perl-Module--Pluggable"

inherit rpm
