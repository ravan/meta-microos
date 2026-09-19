SUMMARY = "Many-Core Engine for Perl providing parallel processing capabilities"
DESCRIPTION = "MCE spawns a pool of workers and therefore does not fork a new process per \
each element of data. Instead, MCE follows a bank queuing model. Imagine \
the line being the data and bank-tellers the parallel workers. MCE enhances \
that model by adding the ability to chunk the next n elements from the \
input stream to the next available worker."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.904.0"

RPM_NAME = "perl-MCE-1.904.0-1.1.noarch.rpm"
RPM_HASH = "41344a5f0e616f9a94e353cf48e60960353f14dd50127c0dfc5f357f78971c74eb02f7713376b50aae6eb82af35fff2f49254c425915b7e4489b4d1d012e9ac9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MCE \
perl-MCE--Candy \
perl-MCE--Channel \
perl-MCE--Channel--Mutex \
perl-MCE--Channel--MutexFast \
perl-MCE--Channel--Simple \
perl-MCE--Channel--SimpleFast \
perl-MCE--Channel--Threads \
perl-MCE--Channel--ThreadsFast \
perl-MCE--Child \
perl-MCE--Core \
perl-MCE--Core--Input--Generator \
perl-MCE--Core--Input--Handle \
perl-MCE--Core--Input--Iterator \
perl-MCE--Core--Input--Request \
perl-MCE--Core--Input--Sequence \
perl-MCE--Core--Manager \
perl-MCE--Core--Validation \
perl-MCE--Core--Worker \
perl-MCE--Flow \
perl-MCE--Grep \
perl-MCE--Loop \
perl-MCE--Map \
perl-MCE--Mutex \
perl-MCE--Mutex--Channel \
perl-MCE--Mutex--Channel2 \
perl-MCE--Mutex--Flock \
perl-MCE--Queue \
perl-MCE--Relay \
perl-MCE--Signal \
perl-MCE--Step \
perl-MCE--Stream \
perl-MCE--Subs \
perl-MCE--Util"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
