SUMMARY = "System() and background procs w/ piping, redirs, ptys (Unix, Win32)"
DESCRIPTION = "IPC::Run allows you to run and interact with child processes using files, \
pipes, and pseudo-ttys. Both system()-style and scripted usages are \
supported and may be mixed. Likewise, functional and OO API styles are both \
supported and may be mixed. \
 \
Various redirection operators reminiscent of those seen on common Unix and \
DOS command lines are provided."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "20260402.0.0"

RPM_NAME = "perl-IPC-Run-20260402.0.0-1.3.noarch.rpm"
RPM_HASH = "6883277ee974d227110e67b18e5a5be6baa371068674057eb58e0feaad9a2369a47b3b3ca1354fac733fa9dca74c341fa594d3527438942833a4a420af632532"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-IPC--Run \
perl-IPC--Run--Debug \
perl-IPC--Run--IO \
perl-IPC--Run--Timer \
perl-IPC--Run--Win32Helper \
perl-IPC--Run--Win32IO \
perl-IPC--Run--Win32Process \
perl-IPC--Run--Win32Pump \
perl-IPC-Run"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-IO--Pty"

inherit rpm
