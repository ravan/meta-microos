SUMMARY = "Log events to an array (reference)"
DESCRIPTION = "This provides a Log::Dispatch log output system that appends logged events \
to an array reference. This is probably only useful for testing the logging \
of your code."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.005"

RPM_NAME = "perl-Log-Dispatch-Array-1.005-1.18.noarch.rpm"
RPM_HASH = "28b6adfbd6f15887c4d91813504fc43664fa3b36da91291940aba5997f25e240af29b16dfd07af368244bf14c48eed64839a2a0e7ca01e1aa15f498a5fab1fbd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Log--Dispatch--Array \
perl-Log-Dispatch-Array"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Log--Dispatch--Output \
perl-parent"

inherit rpm
