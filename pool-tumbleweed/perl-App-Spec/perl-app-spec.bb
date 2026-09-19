SUMMARY = "Specification for commandline app"
DESCRIPTION = "Specification for commandline app"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.15.0"

RPM_NAME = "perl-App-Spec-0.15.0-1.3.noarch.rpm"
RPM_HASH = "ef0a2c0eda05b2f1b71ac62881edcf5c4f3aba17a146c128e62e4ce74a6fd59e3c12c5a576601a5f394592180644994596b0bb3e278a2e5159bd10738a37bad1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-App--Spec \
perl-App--Spec--Argument \
perl-App--Spec--Completion \
perl-App--Spec--Completion--Bash \
perl-App--Spec--Completion--Zsh \
perl-App--Spec--Option \
perl-App--Spec--Parameter \
perl-App--Spec--Plugin--Format \
perl-App--Spec--Plugin--Help \
perl-App--Spec--Plugin--Meta \
perl-App--Spec--Pod \
perl-App--Spec--Role--Command \
perl-App--Spec--Role--Plugin \
perl-App--Spec--Role--Plugin--GlobalOptions \
perl-App--Spec--Role--Plugin--Subcommand \
perl-App--Spec--Run \
perl-App--Spec--Run--Cmd \
perl-App--Spec--Run--Output \
perl-App--Spec--Run--Response \
perl-App--Spec--Run--Validator \
perl-App--Spec--Schema \
perl-App--Spec--Subcommand \
perl-App-Spec"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-List--MoreUtils \
perl-List--Util \
perl-Module--Runtime \
perl-Moo \
perl-Moo--Role \
perl-Ref--Util \
perl-Text--Table \
perl-YAML--PP"

inherit rpm
