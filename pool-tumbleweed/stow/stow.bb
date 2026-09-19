SUMMARY = "Manage the installation of software packages from source"
DESCRIPTION = "GNU Stow is a symlink farm manager which takes distinct packages of \
software and/or data located in separate directories on the \
filesystem, and makes them appear to be installed in the same place. \
For example, /usr/local/bin could contain symlinks to files within \
/usr/local/stow/emacs/bin, /usr/local/stow/perl/bin etc., and \
likewise recursively for any other subdirectories such as .../share, \
.../man, and so on. \
 \
This is particularly useful for keeping track of system-wide and \
per-user installations of software built from source, but can also \
facilitate a more controlled approach to management of configuration \
files in the user's home directory, especially when coupled with \
version control systems. \
 \
Stow is implemented as a combination of a Perl script providing a CLI \
interface, and a backend Perl module which does most of the work."
LICENSE = "GPL-3.0-or-later"

PV = "2.4.1"

RPM_NAME = "stow-2.4.1-1.10.noarch.rpm"
RPM_HASH = "de648b7dfc4cd474eaa4e206b8bd5c03bcc2507c02da71c0bde5c8eb4f716930706b0a9c17acb0ce994884bdd99929b3ba00d0df2bf9cd4c59bcbf5cadf93872"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Stow \
perl-Stow--Util \
stow"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
perl \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
