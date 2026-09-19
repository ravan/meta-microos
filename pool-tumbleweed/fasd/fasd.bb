SUMMARY = "Command-line productivity booster, offers quick access to files and directories"
DESCRIPTION = "Fasd (pronounced similar to 'fast') is a command-line productivity booster. Fasd offers quick access to files and directories for \
POSIX shells. It is inspired by tools like autojump, z and v. Fasd keeps track of files and directories you have accessed, so that \
you can quickly reference them in the command line. \
 \
The name fasd comes from the default suggested aliases f(files), a(files/directories), s(show/search/select), d(directories). \
 \
Fasd ranks files and directories by 'frecency,' that is, by both 'frequency' and 'recency.' The term 'frecency' was first coined \
by Mozilla and used in Firefox."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "fasd-1.0.1-1.22.noarch.rpm"
RPM_HASH = "bf14062bfe07b1571dd49879b2cbaf363db6e33b87de80e401a8ba8470a44a3898391d20ab04ffa9c075944b8a30c2b2772a808bc9dd811c02e2676493961ad7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fasd"

RDEPENDS:${PN} += "/usr/bin/env"

inherit rpm
