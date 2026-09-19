SUMMARY = "Dispatcher module for command line interface programs"
DESCRIPTION = "'App::CLI' dispatches CLI (command line interface) based commands into \
command classes. It also supports subcommand and per-command options."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.520.0"

RPM_NAME = "perl-App-CLI-0.520.0-1.7.noarch.rpm"
RPM_HASH = "8f166bed0d6a7275ed2b34dcc6a6409436106fcf0c159f62deac97e83bce8a92d87ce33f32d39958ba39af31418334f5639c7d53de2bdc5a084f5a9591307ef7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-App--CLI \
perl-App--CLI--Command \
perl-App--CLI--Command--Commands \
perl-App--CLI--Command--Help \
perl-App--CLI--Command--Version \
perl-App--CLI--Helper \
perl-App-CLI"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Capture--Tiny \
perl-Class--Load \
perl-Locale--Maketext--Simple \
perl-Pod--Simple--Text"

inherit rpm
