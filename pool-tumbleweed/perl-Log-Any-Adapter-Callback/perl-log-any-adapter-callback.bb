SUMMARY = "(DEPRECATED)(ADOPTME) Send Log::Any logs to a subroutine"
DESCRIPTION = "DEPRECATION NOTICE: Log::Any distribution since 1.708 comes with \
Log::Any::Adapter::Capture which does the same thing. I'm deprecating this \
adapter now. \
 \
This adapter lets you specify callback subroutine to be called by \
Log::Any's logging methods (like $log->debug(), $log->error(), etc) and \
detection methods (like $log->is_warning(), $log->is_fatal(), etc.). \
 \
This adapter is used for customized logging, and is mostly a convenient \
construct to save a few lines of code. You could achieve the same effect by \
creating a full Log::Any adapter class. \
 \
Your logging callback subroutine will be called with these arguments: \
 \
 ($method, $self, $format, @params) \
 \
where $method is the name of method (like 'debug') and ($self, $format, \
@params) are given by Log::Any."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.102.0"

RPM_NAME = "perl-Log-Any-Adapter-Callback-0.102.0-2.12.noarch.rpm"
RPM_HASH = "916cec154731f448bccfa7be3c5c07a729da94de57db37486921030166dc4788150739f4a17ea2b64115f16fb1d3060bb43893b23308a83db37d9578658d1a84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Log--Any--Adapter--Callback \
perl-Log-Any-Adapter-Callback"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Log--Any--Adapter"

inherit rpm
