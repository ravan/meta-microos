SUMMARY = "Microsoft Azure bundle"
DESCRIPTION = "This is the Microsoft Azure bundle. \
 \
This package does not contain any code in itself. It installs a set \
of packages that provide Microsoft Azure functionality. \
 \
All packages in this bundle have been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "4.0.0"

RPM_NAME = "python314-azure-sdk-4.0.0-17.4.noarch.rpm"
RPM_HASH = "a2804e28a260c46397ae3caf14b6ca2774d8d04d01dc64c9e19476ffc85ef5484e64a8c6bda2acc7bc3a590ba1d5d8b4a99125735af71bf091ff3f3416bf245a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-azure-sdk"

RDEPENDS:${PN} += "python314-applicationinsights \
python314-azure-agrifood-farming \
python314-azure-ai-anomalydetector \
python314-azure-ai-contentsafety \
python314-azure-ai-formrecognizer \
python314-azure-ai-language-conversations \
python314-azure-ai-language-questionanswering \
python314-azure-ai-metricsadvisor \
python314-azure-ai-ml \
python314-azure-ai-nspkg \
python314-azure-ai-textanalytics \
python314-azure-ai-translation-document \
python314-azure-ai-translation-text \
python314-azure-appconfiguration \
python314-azure-appconfiguration-provider \
python314-azure-applicationinsights \
python314-azure-batch \
python314-azure-cognitiveservices-anomalydetector \
python314-azure-cognitiveservices-formrecognizer \
python314-azure-cognitiveservices-inkrecognizer \
python314-azure-cognitiveservices-knowledge-nspkg \
python314-azure-cognitiveservices-knowledge-qnamaker \
python314-azure-cognitiveservices-language-luis \
python314-azure-cognitiveservices-language-nspkg \
python314-azure-cognitiveservices-language-spellcheck \
python314-azure-cognitiveservices-language-textanalytics \
python314-azure-cognitiveservices-nspkg \
python314-azure-cognitiveservices-personalizer \
python314-azure-cognitiveservices-search-autosuggest \
python314-azure-cognitiveservices-search-customimagesearch \
python314-azure-cognitiveservices-search-customsearch \
python314-azure-cognitiveservices-search-entitysearch \
python314-azure-cognitiveservices-search-imagesearch \
python314-azure-cognitiveservices-search-newssearch \
python314-azure-cognitiveservices-search-nspkg \
python314-azure-cognitiveservices-search-videosearch \
python314-azure-cognitiveservices-search-visualsearch \
python314-azure-cognitiveservices-search-websearch \
python314-azure-cognitiveservices-vision-computervision \
python314-azure-cognitiveservices-vision-contentmoderator \
python314-azure-cognitiveservices-vision-customvision \
python314-azure-cognitiveservices-vision-face \
python314-azure-cognitiveservices-vision-nspkg \
python314-azure-common \
python314-azure-communication-administration \
python314-azure-communication-callautomation \
python314-azure-communication-chat \
python314-azure-communication-email \
python314-azure-communication-identity \
python314-azure-communication-jobrouter \
python314-azure-communication-messages \
python314-azure-communication-networktraversal \
python314-azure-communication-nspkg \
python314-azure-communication-phonenumbers \
python314-azure-communication-rooms \
python314-azure-communication-sms \
python314-azure-confidentialledger \
python314-azure-containerregistry \
python314-azure-core \
python314-azure-core-experimental \
python314-azure-core-tracing-opencensus \
python314-azure-core-tracing-opentelemetry \
python314-azure-cosmos \
python314-azure-data-nspkg \
python314-azure-data-tables \
python314-azure-datalake-store \
python314-azure-defender-easm \
python314-azure-developer-devcenter \
python314-azure-developer-loadtesting \
python314-azure-devops \
python314-azure-digitaltwins-core \
python314-azure-eventgrid \
python314-azure-eventhub \
python314-azure-eventhub-checkpointstoreblob \
python314-azure-eventhub-checkpointstoreblob-aio \
python314-azure-graphrbac \
python314-azure-health-deidentification \
python314-azure-healthinsights-cancerprofiling \
python314-azure-healthinsights-clinicalmatching \
python314-azure-healthinsights-radiologyinsights \
python314-azure-identity \
python314-azure-identity-broker \
python314-azure-iot-deviceprovisioning \
python314-azure-iot-deviceupdate \
python314-azure-iot-nspkg \
python314-azure-keyvault \
python314-azure-keyvault-administration \
python314-azure-keyvault-certificates \
python314-azure-keyvault-keys \
python314-azure-keyvault-nspkg \
python314-azure-keyvault-secrets \
python314-azure-loganalytics \
python314-azure-maps-geolocation \
python314-azure-maps-render \
python314-azure-maps-route \
python314-azure-maps-timezone \
python314-azure-media-videoanalyzer-edge \
python314-azure-messaging-webpubsubclient \
python314-azure-messaging-webpubsubservice \
python314-azure-mgmt \
python314-azure-mgmt-appcontainers \
python314-azure-mgmt-confidentialledger \
python314-azure-mgmt-dnsresolver \
python314-azure-mgmt-dynatrace \
python314-azure-mgmt-nginx \
python314-azure-mgmt-scvmm \
python314-azure-mgmt-workloads \
python314-azure-mixedreality-authentication \
python314-azure-monitor-ingestion \
python314-azure-monitor-opentelemetry-exporter \
python314-azure-monitor-query \
python314-azure-monitor-querymetrics \
python314-azure-multiapi-storage \
python314-azure-nspkg \
python314-azure-onlineexperimentation \
python314-azure-purview-account \
python314-azure-purview-administration \
python314-azure-purview-catalog \
python314-azure-purview-scanning \
python314-azure-purview-sharing \
python314-azure-schemaregistry \
python314-azure-schemaregistry-avroencoder \
python314-azure-schemaregistry-avroserializer \
python314-azure-search-documents \
python314-azure-search-nspkg \
python314-azure-security-attestation \
python314-azure-servicebus \
python314-azure-servicefabric \
python314-azure-servicemanagement-legacy \
python314-azure-storage-blob \
python314-azure-storage-blob-changefeed \
python314-azure-storage-common \
python314-azure-storage-file \
python314-azure-storage-file-datalake \
python314-azure-storage-file-share \
python314-azure-storage-nspkg \
python314-azure-storage-queue \
python314-azure-synapse-accesscontrol \
python314-azure-synapse-artifacts \
python314-azure-synapse-managedprivateendpoints \
python314-azure-synapse-monitoring \
python314-azure-synapse-nspkg \
python314-azure-synapse-spark \
python314-azure-template \
python314-msal \
python314-msal-extensions \
python314-msrest"

inherit rpm
