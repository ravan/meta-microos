SUMMARY = "Miscellaneous X11::Protocol helpers"
DESCRIPTION = "This is some helper functions for 'X11::Protocol'."
LICENSE = "GPL-1.0-or-later"

PV = "31"

RPM_NAME = "perl-X11-Protocol-Other-31-1.32.aarch64.rpm"
RPM_HASH = "cb5717caec57537ad59ea58a08504d9c717419e36e7a543d4d66a65fa88710142c06c42dbb82c8ba4f89e0e0307e032407b461db5a31fc4d4d953973cfa77c8b"

RPROVIDES:${PN} += "perl-Encode--X11 \
perl-X11--AtomConstants \
perl-X11--CursorFont \
perl-X11--Protocol--ChooseWindow \
perl-X11--Protocol--Ext--Composite \
perl-X11--Protocol--Ext--DAMAGE \
perl-X11--Protocol--Ext--DOUBLE-BUFFER \
perl-X11--Protocol--Ext--MIT-SCREEN-SAVER \
perl-X11--Protocol--Ext--MIT-SHM \
perl-X11--Protocol--Ext--MIT-SUNDRY-NONSTANDARD \
perl-X11--Protocol--Ext--TOG-CUP \
perl-X11--Protocol--Ext--X-Resource \
perl-X11--Protocol--Ext--XFIXES \
perl-X11--Protocol--Ext--XFree86-DGA \
perl-X11--Protocol--Ext--XINERAMA \
perl-X11--Protocol--Ext--XTEST \
perl-X11--Protocol--GrabServer \
perl-X11--Protocol--Other \
perl-X11--Protocol--WM \
perl-X11--Protocol--XSetRoot \
perl-X11-Protocol-Other"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-X11--Protocol"

inherit rpm
