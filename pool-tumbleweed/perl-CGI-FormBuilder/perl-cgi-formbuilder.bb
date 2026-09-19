SUMMARY = "Easily generate and process stateful forms"
DESCRIPTION = "If this is your first time using *FormBuilder*, you should check out the \
website for tutorials and examples at http://formbuilder.org. \
 \
You should also consider joining the google group at \
http://groups.google.com/group/perl-formbuilder. There are some pretty \
smart people on the list that can help you out."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "3.200.0"

RPM_NAME = "perl-CGI-FormBuilder-3.200.0-1.9.noarch.rpm"
RPM_HASH = "6f4cb04db332b9d07bf74d379dd1d923bf48e5b9e60feb528e8e410ff1f9ff58cac7b136bee9cb2cba86c6242b895e22c0f7ae09bac0a3b6bd241c8c007cd7e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-CGI--FormBuilder \
perl-CGI--FormBuilder--Field \
perl-CGI--FormBuilder--Field--button \
perl-CGI--FormBuilder--Field--checkbox \
perl-CGI--FormBuilder--Field--date \
perl-CGI--FormBuilder--Field--datetime \
perl-CGI--FormBuilder--Field--datetime-local \
perl-CGI--FormBuilder--Field--email \
perl-CGI--FormBuilder--Field--file \
perl-CGI--FormBuilder--Field--hidden \
perl-CGI--FormBuilder--Field--image \
perl-CGI--FormBuilder--Field--number \
perl-CGI--FormBuilder--Field--password \
perl-CGI--FormBuilder--Field--radio \
perl-CGI--FormBuilder--Field--select \
perl-CGI--FormBuilder--Field--static \
perl-CGI--FormBuilder--Field--submit \
perl-CGI--FormBuilder--Field--text \
perl-CGI--FormBuilder--Field--textarea \
perl-CGI--FormBuilder--Field--time \
perl-CGI--FormBuilder--Field--url \
perl-CGI--FormBuilder--Messages \
perl-CGI--FormBuilder--Messages--base \
perl-CGI--FormBuilder--Messages--default \
perl-CGI--FormBuilder--Messages--locale \
perl-CGI--FormBuilder--Multi \
perl-CGI--FormBuilder--Source \
perl-CGI--FormBuilder--Source--File \
perl-CGI--FormBuilder--Template \
perl-CGI--FormBuilder--Template--Builtin \
perl-CGI--FormBuilder--Template--CGI-SSI \
perl-CGI--FormBuilder--Template--Div \
perl-CGI--FormBuilder--Template--Fast \
perl-CGI--FormBuilder--Template--HTML \
perl-CGI--FormBuilder--Template--TT2 \
perl-CGI--FormBuilder--Template--Text \
perl-CGI--FormBuilder--Test \
perl-CGI--FormBuilder--Util \
perl-CGI-FormBuilder"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-CGI"

inherit rpm
