SUMMARY = "GUI for the ClamAV Antivirus"
DESCRIPTION = "ClamTk is a GUI front-end for ClamAV using Gtk3-perl. \
It is designed to be an easy-to-use, point and click virus scanner."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "6.18"

RPM_NAME = "clamtk-6.18-1.14.noarch.rpm"
RPM_HASH = "de6c7df02ec7cae7395ed0c37fd0bf8eea077bd831c61cef5bf7fc2c258f2c204e47f81041ed3f4e4a72563d4e29390897ae2c334bc299e0a5062c5f00ee0391"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "clamtk \
perl-ClamTk--Analysis \
perl-ClamTk--App \
perl-ClamTk--Assistant \
perl-ClamTk--GUI \
perl-ClamTk--History \
perl-ClamTk--Icons \
perl-ClamTk--Network \
perl-ClamTk--Prefs \
perl-ClamTk--Quarantine \
perl-ClamTk--Results \
perl-ClamTk--Scan \
perl-ClamTk--Schedule \
perl-ClamTk--Settings \
perl-ClamTk--Shortcuts \
perl-ClamTk--Startup \
perl-ClamTk--Update \
perl-ClamTk--Whitelist"

RDEPENDS:${PN} += "/usr/bin/perl \
clamav \
gnome-icon-theme \
perl--MODULE-COMPAT-5.44.0 \
perl-Cwd \
perl-Digest--SHA \
perl-Encode \
perl-File--Basename \
perl-File--Copy \
perl-File--Path \
perl-Glib \
perl-Gtk3 \
perl-JSON \
perl-LWP--Protocol--https \
perl-LWP--UserAgent \
perl-Locale--gettext \
perl-Net--DNS \
perl-Text--CSV \
perl-Time--Piece \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-GdkPixdata \
typelib-Gtk \
typelib-Pango \
zenity"

inherit rpm
