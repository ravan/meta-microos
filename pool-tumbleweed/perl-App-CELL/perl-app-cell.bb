SUMMARY = "Configuration, Error-handling, Localization, and Logging"
DESCRIPTION = "This is the top-level module of App::CELL, the Configuration, \
Error-handling, Localization, and Logging framework for applications (or \
scripts) written in Perl. \
 \
For details, read the POD in the App::CELL distro. For an introduction, \
read App::CELL::Guide."
LICENSE = "BSD-3-Clause"

PV = "0.231"

RPM_NAME = "perl-App-CELL-0.231-1.20.noarch.rpm"
RPM_HASH = "4f4cc9a3281cdf7cddc6f73b6d51efebba407b40e2f88c3d7c2a91aa7c5f43cb53f66f3425018987c24ce7857b7d963073bd031acf90db585d68a647c4fef965"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-App--CELL \
perl-App--CELL--Config \
perl-App--CELL--Guide \
perl-App--CELL--Load \
perl-App--CELL--Log \
perl-App--CELL--Message \
perl-App--CELL--Status \
perl-App--CELL--Test \
perl-App--CELL--Test--LogToFile \
perl-App--CELL--Util \
perl-App-CELL"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Date--Format \
perl-File--HomeDir \
perl-File--Next \
perl-File--ShareDir \
perl-Log--Any \
perl-Log--Any--Adapter \
perl-Params--Validate \
perl-Try--Tiny"

inherit rpm
