SUMMARY = "Perl extension for reading from continously updated files"
DESCRIPTION = "The primary purpose of File::Tail is reading and analysing log files while \
they are being written, which is especialy usefull if you are monitoring \
the logging process with a tool like Tobias Oetiker's MRTG. \
 \
The module tries very hard NOT to 'busy-wait' on a file that has little \
traffic. Any time it reads new data from the file, it counts the number of \
new lines, and divides that number by the time that passed since data were \
last written to the file before that. That is considered the average time \
before new data will be written. When there is no new data to read, \
'File::Tail' sleeps for that number of seconds. Thereafter, the waiting \
time is recomputed dynamicaly. Note that 'File::Tail' never sleeps for more \
than the number of seconds set by 'maxinterval'. \
 \
If the file does not get altered for a while, 'File::Tail' gets suspicious \
and startschecking if the file was truncated, or moved and recreated. If \
anything like that had happened, 'File::Tail' will quietly reopen the file, \
and continue reading. The only way to affect what happens on reopen is by \
setting the reset_tail parameter (see below). The effect of this is that \
the scripts need not be aware when the logfiles were rotated, they will \
just quietly work on. \
 \
Note that the sleep and time used are from Time::HiRes, so this module \
should do the right thing even if the time to sleep is less than one \
second. \
 \
The logwatch script (also included) demonstrates several ways of calling \
the methods."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.300.0"

RPM_NAME = "perl-File-Tail-1.300.0-1.9.noarch.rpm"
RPM_HASH = "e710e4258a642fda197f03aea11e41ca74348cd90e3aee745f3b27d4b07d77fe52c8109930a7687fed23d538e138d7cbaefd88869c61b28a74bb3ae9a1686e2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-File--Tail \
perl-File-Tail"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
