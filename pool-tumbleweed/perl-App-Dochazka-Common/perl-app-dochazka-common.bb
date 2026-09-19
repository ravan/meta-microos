SUMMARY = "Dochazka Attendance and Time Tracking System shared modules"
DESCRIPTION = "This distro contains modules that are used by both the server the \
App::Dochazka::REST manpage and the command-line client the \
App::Dochazka::CLI manpage."
LICENSE = "BSD-3-Clause"

PV = "0.210"

RPM_NAME = "perl-App-Dochazka-Common-0.210-1.18.noarch.rpm"
RPM_HASH = "dd4140cea4fcfaf92fc15a5d4108455885f12049ec7c2bed4467b0fec17778564208942569f6a818689bc73ae4fa1f799822f77acdd596d57578e288bc29484a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-App--Dochazka--Common \
perl-App--Dochazka--Common--Model \
perl-App--Dochazka--Common--Model--Activity \
perl-App--Dochazka--Common--Model--Component \
perl-App--Dochazka--Common--Model--Employee \
perl-App--Dochazka--Common--Model--Interval \
perl-App--Dochazka--Common--Model--Lock \
perl-App--Dochazka--Common--Model--Policy \
perl-App--Dochazka--Common--Model--Privhistory \
perl-App--Dochazka--Common--Model--Schedhistory \
perl-App--Dochazka--Common--Model--Schedintvls \
perl-App--Dochazka--Common--Model--Schedule \
perl-App--Dochazka--Common--Model--Tempintvl \
perl-App-Dochazka-Common"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Params--Validate \
perl-Test--Deep--NoTest \
perl-Time--Piece \
perl-Time--Seconds"

inherit rpm
