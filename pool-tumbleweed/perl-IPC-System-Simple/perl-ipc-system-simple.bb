SUMMARY = "Run commands simply, with detailed diagnostics"
DESCRIPTION = "Calling Perl's in-built 'system()' function is easy, determining if it was \
successful is _hard_. Let's face it, '$?' isn't the nicest variable in the \
world to play with, and even if you _do_ check it, producing a \
well-formatted error string takes a lot of work. \
 \
'IPC::System::Simple' takes the hard work out of calling external commands. \
In fact, if you want to be really lazy, you can just write: \
 \
    use IPC::System::Simple qw(system); \
 \
and all of your 'system' commands will either succeed (run to completion \
and return a zero exit value), or die with rich diagnostic messages. \
 \
The 'IPC::System::Simple' module also provides a simple replacement to \
Perl's backticks operator. Simply write: \
 \
    use IPC::System::Simple qw(capture); \
 \
and then use the capture() command just like you'd use backticks. If \
there's an error, it will die with a detailed description of what went \
wrong. Better still, you can even use 'capturex()' to run the equivalent of \
backticks, but without the shell: \
 \
    use IPC::System::Simple qw(capturex); \
 \
    my $result = capturex($command, @args); \
 \
If you want more power than the basic interface, including the ability to \
specify which exit values are acceptable, trap errors, or process \
diagnostics, then read on!"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.300.0"

RPM_NAME = "perl-IPC-System-Simple-1.300.0-1.7.noarch.rpm"
RPM_HASH = "75d72fb6fb8a2209f97fbb61124dffc49d1b4fda3a91ea91b1c9a2d40ce1e67ac140c86d3d6dedb8fcb985eef93266f8993c77e35f7bc8b680a1d2aa4c42b719"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-IPC--System--Simple \
perl-IPC-System-Simple"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
