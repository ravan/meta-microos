SUMMARY = "Abstract collection of monitoring metrics"
DESCRIPTION = "Provides a central location for modules to report monitoring metrics, such \
as counters of the number of times interesting events have happened, and \
programs to collect up and send those metrics to monitoring services. \
 \
Inspired by Log::Any, this module splits the overall problem into two \
sides. Modules wishing to provide metrics for monitoring purposes can use \
the 'use Metrics::Any' statement to obtain a _collector_ into which they \
can report metric events. By default this collector doesn't actually do \
anything, so modules can easily use it without adding extra specific \
dependencies for specific reporting. \
 \
A program using one or more such modules can apply a different policy and \
request a particular _adapter_ implementation in order to actually report \
these metrics to some external system, by using the 'use \
Metrics::Any::Adapter' statement. \
 \
This separation of concerns allows module authors to write code which will \
report metrics without needing to care about the exact mechanism of that \
reporting (as well as to write code which does not itself depend on the \
code required to perform that reporting)."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.100.0"

RPM_NAME = "perl-Metrics-Any-0.100.0-2.12.noarch.rpm"
RPM_HASH = "190b124b0eda54f11474ffa8051dd8683efd852f47be10674f2c0c0acdc69d817b36b81b4db2a7361b854de26370f5529b4e1d463e700c3f7ffb329f0e003308"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Metrics--Any \
perl-Metrics--Any--Adapter \
perl-Metrics--Any--Adapter--File \
perl-Metrics--Any--Adapter--Null \
perl-Metrics--Any--Adapter--Stderr \
perl-Metrics--Any--Adapter--Tee \
perl-Metrics--Any--Adapter--Test \
perl-Metrics--Any--AdapterBase--Stored \
perl-Metrics--Any--Collector \
perl-Metrics-Any"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-List--Util"

inherit rpm
